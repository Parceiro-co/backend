public class ParceiroService {

    @Autowired
    private final ParceiroRepository repository;
    
    @Autowired
    private final ContactService contactService;

    public ResponseEntity<Parceiro> createParceiro(
        ParceiroDTORequest parceiroRequest
    ) {

        // Na verdade todos esse objetos devem ser dtos
        Address address = addressService.createAddress(
            parceiroRequest.Address()
        );

        // Na verdade todos esse objetos devem ser dtos
        Contact contact = contactService.createContact(
            parceiroRequest.Contact()
        );

        // Na verdade todos esse objetos devem ser dtos
        Document document = documentService.createDocument(
            "CPF",
            parceiroRequest.Document()
        )

        return ParceiroRepository.save(
            new Parceiro.builder()
                .nome(parceiroRequest.getName())
                .disponibility(false),
                .about(""),
                .creationDate(LocalDateTime.now())
                .build();
        );
    }

    @GetMapping
    public ResponseEntity<List<?>> readAllParceiro() {
        try {
            return ParceiroService.readAllParceiro();
        } catch (Exception e) {
            System.out.println("Erro: "+ e);
            return null;
        }
    }

    @PostMapping
    public ResponseEntity<?> updateParceiro(
        @PathVariable Long id, 
        @Valid @RequestBody ParceiroDTORequestToCreate parceiroRequest
    ) {
        try {
            return ParceiroService.updateParceiro(parceiroRequest);
        } catch (Exception e) {
            System.out.println("Erro: "+ e);
            return null;
        }
    }

    @DeleteMapping
    public Void deleteParceiro(
        @PathVariable Long id 
    ) {
        try {
            return ParceiroService.deleteParceiro(id);
        } catch (Exception e) {
            System.out.println("Erro: "+ e);
            return null;
        }
    }

}
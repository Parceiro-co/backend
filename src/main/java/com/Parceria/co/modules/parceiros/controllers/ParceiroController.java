@RestController
@RequestMapping("/parceiros")
public class ParceiroController {

    @Autowired
    private final ParceiroService parceiroService;

    @Autowired
    private final ParceiroMapperToDTOResponse mapperToDtoResponse;


    /*
        - createParceiro - Create
        - endpoint para criar parceiro
        - endpoint "/parceiros" (POST)
    */
    @PostMapping
    public ResponseEntity<?> createParceiro(
        @Valid @RequestBody ParceiroDTORequest parceiroRequest
    ) {
        try {
            return ParceiroService.createParceiro(parceiroRequest);
        } catch (Exception e) {
            System.out.println("Erro: "+ e);
            return null;
        }
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

    // Outros
}
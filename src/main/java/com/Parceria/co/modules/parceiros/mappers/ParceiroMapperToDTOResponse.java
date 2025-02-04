@Component
public class ParceiroMapperToDTOResponse<Parceiro, ParceiroDTOResponse> {
    
    @Override
    public ParceiroDTOResponse map(Parceiro model) {
        return new ParceiroDTOResponse(
            // o id deve ser encriptado para ir e para voltar
            model.getId(),
            model.getName(),
            model.getDisponibility(),
            model.getAbout(),
            model.getCreationDate()
        );
    }

}
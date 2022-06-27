package TareaExamen.service;

import TareaExamen.domain.Estados;
import java.util.List;

public interface EstadoService {

    public List<Estados> getEstados();

    public void save(Estados estados);

    public void delete(Estados estados);

    public Estados getEstados(Estados estados);

}

package TareaExamen.service;

import TareaExamen.dao.EstadoDao;
import TareaExamen.domain.Estados;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EstadoServiceImpl implements EstadoService {
    
    @Autowired
    private EstadoDao estadoDao;
    
    @Override
    @Transactional(readOnly=true)
    public List<Estados> getEstados() {
        return (List<Estados>) estadoDao.findAll(); 
    }

    @Override
    @Transactional
    public void save(Estados estados) {
        estadoDao.save(estados);
    }

    @Override
    @Transactional
    public void delete(Estados estados) {
        estadoDao.delete(estados);
    }

    @Override
    @Transactional(readOnly=true)
    public Estados getEstados(Estados estados) {
        return estadoDao.findById(estados.getId_estado()).orElse(null);
    }

}

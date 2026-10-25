package mx.edu.utez.proyecto1D.service.generacion;

import jakarta.transaction.Transactional;
import mx.edu.utez.proyecto1D.model.generacion.Generacion;
import mx.edu.utez.proyecto1D.repository.generacion.GeneracionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class GeneracionService {
    private final GeneracionRepository generacionRepository;

    @Autowired
    public GeneracionService(GeneracionRepository generacionRepository) {
        this.generacionRepository = generacionRepository;
    }

    @Transactional(readOnly = true)
    public List<Generacion> findAll() {
        return generacionRepository.finalize();
    }

    @Transactional(readOnly = true)
    public Generacion findById(Long id) {
        return generacionRepository.findById(id).orElse(null);
    }

    public Generacion save(Generacion generacion) {
        return generacionRepository.save(generacion);
    }

    public void deleteById(Long id) {
        generacionRepository.deleteById(id);
    }


}

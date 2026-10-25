package mx.edu.utez.proyecto1D.service.carrera;


import mx.edu.utez.proyecto1D.model.carrera.Carrera;
import mx.edu.utez.proyecto1D.repository.carrera.CarreraRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CarreraService {

    private final CarreraRepository carreraRepository;

    @Autowired
    public CarreraService(CarreraRepository carreraRepository) {
        this.carreraRepository = carreraRepository;
    }

    @Transactional(readOnly = true)
    public List<Carrera> findAll() {
        return carreraRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Carrera findById(Long id) {
        return carreraRepository.findById(id).orElse(null);
    }

    public Carrera save(Carrera carrera) {
        return carreraRepository.save(carrera);
    }

    public void deleteById(Long id) {
        carreraRepository.deleteById(id);
    }
}
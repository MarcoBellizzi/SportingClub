package marco.sporting.controller;

import marco.sporting.data.dto.DebitoDto;
import marco.sporting.data.service.DebitoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/sporting")
public class DebitoController {

    @Autowired
    private DebitoService debitoService;

    @PostMapping("/debito/add")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<DebitoDto> save(@RequestBody DebitoDto debitoDto) {
        return ResponseEntity.ok(debitoService.save(debitoDto));
    }

    @GetMapping("/debiti")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<DebitoDto>> getAllDebiti() {
        return ResponseEntity.ok(debitoService.getDebiti());
    }

    @GetMapping("/debiti/atleta")
    @CrossOrigin(origins = "http://localhost:4200")
    public ResponseEntity<List<DebitoDto>> getDebiti(@RequestParam(name = "atletaId") Long atletaId) {
        return ResponseEntity.ok(debitoService.getDebiti(atletaId));
    }

}
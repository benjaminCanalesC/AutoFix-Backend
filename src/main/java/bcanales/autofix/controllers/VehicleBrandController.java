package bcanales.autofix.controllers;

import bcanales.autofix.entities.VehicleBrandEntity;
import bcanales.autofix.services.VehicleBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehicleBrands")
@CrossOrigin("*")
public class VehicleBrandController {
    @Autowired
    VehicleBrandService vehicleBrandService;

    @PostMapping("/")
    public ResponseEntity<VehicleBrandEntity> saveVehicleBrand(@RequestBody VehicleBrandEntity vehicleBrand) {
        VehicleBrandEntity newVehicleBrand = vehicleBrandService.saveVehicleBrand(vehicleBrand);
        return ResponseEntity.ok(newVehicleBrand);
    }

    @GetMapping("/")
    public ResponseEntity<List<VehicleBrandEntity>> getVehicleBrands() {
        List<VehicleBrandEntity> vehicleBrands = vehicleBrandService.getVehicleBrands();
        return ResponseEntity.ok(vehicleBrands);
    }
}

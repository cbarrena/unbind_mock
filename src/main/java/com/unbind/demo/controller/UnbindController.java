package com.unbind.demo.controller;

import com.unbind.demo.dto.ApiError;
import com.unbind.demo.dto.ErrorParameters;
import com.unbind.demo.dto.Input;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.security.krb5.internal.APOptions;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/payments/v0/third-parties-providers/")
public class UnbindController {
    @PostMapping("{thirdPartyProviderId}/single-sign-on/unbind-account")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public ResponseEntity<?> unbind(@RequestHeader("tsec") String tsec, @PathVariable String thirdPartyProviderId, @RequestBody Input input){
        ApiError out = new ApiError();
        if(tsec.isEmpty() || tsec == null){
            out.setCode("unauthorized");
            out.setMessage("unauthorized");
            List<ErrorParameters> param = new ArrayList<>();
            out.setParameters(param);
            out.setType("FATAL");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(out);
        }
        if (thirdPartyProviderId == null ){
            out.setCode("functionalError");
            out.setMessage("");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(out);
        }
        if (thirdPartyProviderId.isEmpty() ){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("");
        }
        if (input.getThirdPartyUserId().isEmpty()){
            out.setCode("functionalError");
            out.setMessage("00000001#PARAMETROS OBLIGATORIOS");
            List<ErrorParameters> param = new ArrayList<>();
            out.setParameters(param);
            out.setType("FATAL");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(out);
        }
        if (input.getThirdPartyUserId()== null){
            out.setCode("notNullValidation");
            out.setMessage("El valor obligatorio no se ha informado: thirdPartyUserId no puede ser null");
            List<ErrorParameters> param = new ArrayList<>();
            param.add(new ErrorParameters("thirdPartyUserId no puede ser null"));
            out.setParameters(param);
            out.setType("FATAL");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(out);
        }
        return null;
    }
}

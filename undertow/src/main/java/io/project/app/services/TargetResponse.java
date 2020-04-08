/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.project.app.services;

import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author armena
 */
@Data
public class TargetResponse implements Serializable{
    
    private String message;

    public TargetResponse() {
    }

    public TargetResponse(String message) {
        this.message = message;
    }
    
}

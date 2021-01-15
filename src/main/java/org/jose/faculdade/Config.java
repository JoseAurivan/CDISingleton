/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jose.faculdade;

import javax.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 *
 * @author auriv
 */

@ApplicationScoped
public class Config {
    @ConfigProperty(name = "formatoRelatorio")
    private String formatoRelatorio = "pdf";
    
    @ConfigProperty(name = "tipoGraficos")
    private String tipoGraficos = "barras";

    public String getFormatoRelatorio() {
        return formatoRelatorio;
    }

    public void setFormatoRelatorio(String formatoRelatorio) {
        this.formatoRelatorio = formatoRelatorio;
    }

    public String getTipoGraficos() {
        return tipoGraficos;
    }

    public void setTipoGraficos(String tipoGraficos) {
        this.tipoGraficos = tipoGraficos;
    }
    
    
}

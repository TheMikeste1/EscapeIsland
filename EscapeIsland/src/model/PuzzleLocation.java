/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Objects;

/**
 *
 * @author Austin
 */
public class PuzzleLocation extends Location{

    private String interaction; 

    public PuzzleLocation(String interaction, int row, int column, Boolean visited, Boolean complete, String description, BackgroundType backgroundType, Boolean blocked) {
        super(row, column, visited, complete, description, backgroundType, blocked);
        this.interaction = interaction;
    }

    public String getInteraction() {
        return interaction;
    }

    public void setInteraction(String interaction) {
        this.interaction = interaction;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.interaction);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final PuzzleLocation other = (PuzzleLocation) obj;
        if (!Objects.equals(this.interaction, other.interaction)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "PuzzleLocation{" + "interaction=" + interaction + '}';
    }
    
    
    
}

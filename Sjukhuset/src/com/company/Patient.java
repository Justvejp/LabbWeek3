package com.company;

class Patient {

    private final String name;
    private String sickness;

    Patient (String name) {
        this.name = name;
    }

    Patient (String name, String sickness) {
        this.name = name;
        this.sickness = sickness;
    }

    boolean isSick() {
        return sickness != null;
    }

    String getName() {
        return this.name;
   }

    String getSickness() {
        return this.sickness;
   }

    void takeMedication(Medicine meds) {

       if (meds.getTreatmentName().equals(this.sickness)) {
           this.sickness = null;
       }
   }
}









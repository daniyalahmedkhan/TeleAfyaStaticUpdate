package com.example.ast.teleafya.Ui.Model;

/**
 * Created by AST on 10/24/2017.
 */

public class Patient_Appointment {

    public String patient_id;
    public String patient_name;
    public String patient_dr_name;
    public String patient_hos_name;
    public long patient_app_time;


    public Patient_Appointment() {
    }

    public Patient_Appointment(String patient_id, String patient_name, String patient_dr_name, String patient_hos_name, long patient_app_time) {
        this.patient_id = patient_id;
        this.patient_name = patient_name;
        this.patient_dr_name = patient_dr_name;
        this.patient_hos_name = patient_hos_name;
        this.patient_app_time = patient_app_time;
    }

    public String getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(String patient_id) {
        this.patient_id = patient_id;
    }

    public String getPatient_name() {
        return patient_name;
    }

    public void setPatient_name(String patient_name) {
        this.patient_name = patient_name;
    }

    public String getPatient_dr_name() {
        return patient_dr_name;
    }

    public void setPatient_dr_name(String patient_dr_name) {
        this.patient_dr_name = patient_dr_name;
    }

    public String getPatient_hos_name() {
        return patient_hos_name;
    }

    public void setPatient_hos_name(String patient_hos_name) {
        this.patient_hos_name = patient_hos_name;
    }

    public long getPatient_app_time() {
        return patient_app_time;
    }

    public void setPatient_app_time(long patient_app_time) {
        this.patient_app_time = patient_app_time;
    }
}

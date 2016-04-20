package com.example.lizbeth.mensajes;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Victor on 29/02/2016.
 */
public class Personas {

    //DECLARACION DE VARIABLES
    private int Nombre_Persona;
    private int Descripcion_Persona;
    private int Edad_Persona;
    private int Profesion_Persona;
    private int Img_persona;
    private int EstadoCivil_persona;


    //CONSTRUCTOR
    public Personas(
            int nombre_Persona,
            int descripcion_Persona,
            int edad_Personaint,
            int profesion_Persona,
            int img_persona,
            int estadoCivil_persona){

        this.Nombre_Persona = nombre_Persona;
        this.Descripcion_Persona = descripcion_Persona;
        this.Edad_Persona = edad_Personaint;
        this.Profesion_Persona = profesion_Persona;
        this.Img_persona = img_persona;
        this.EstadoCivil_persona = estadoCivil_persona;


    }

    //DECLARACION DE UN LISTA DE TIPO Personas
    public static final List<Personas> PERSONAS_LIST = new ArrayList<Personas>();

    static {
        PERSONAS_LIST.add(new Personas(R.string.nombreP1,
                R.string.descripcionP1,
                R.string.edadP1,
                R.string.profesionP1,
                R.drawable.cabeza,
                R.string.estadocivilP1)

        );
        PERSONAS_LIST.add(new Personas(R.string.nombreP2,
                R.string.descripcionP2,
                R.string.edadP2,
                R.string.profesionP2,
                R.drawable.cuerpo,
                R.string.estadocivilP2)
        );
        PERSONAS_LIST.add(new Personas(R.string.nombreP3,
                R.string.descripcionP3,
                R.string.edadP3,
                R.string.profesionP3,
                R.drawable.muela,
                R.string.estadocivilP3
                )
        );
        PERSONAS_LIST.add(new Personas(R.string.nombreP4,
                R.string.descripcionP4,
                R.string.edadP4,
                R.string.profesionP4,
                R.drawable.pecho,
                R.string.estadocivilP4
                )
        );
        PERSONAS_LIST.add(new Personas(R.string.nombreP5,
                R.string.descripcionP5,
                R.string.edadP5,
                R.string.profesionP5,
                R.drawable.garganta,
                R.string.estadocivilP5
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP6,
                        R.string.descripcionP6,
                        R.string.edadP6,
                        R.string.profesionP6,
                        R.drawable.oido,
                        R.string.estadocivilP6
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP7,
                        R.string.descripcionP7,
                        R.string.edadP7,
                        R.string.profesionP7,
                        R.drawable.vista,
                        R.string.estadocivilP7
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP8,
                        R.string.descripcionP8,
                        R.string.edadP8,
                        R.string.profesionP8,
                        R.drawable.pieces,
                        R.string.estadocivilP8
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP9,
                        R.string.descripcionP9,
                        R.string.edadP9,
                        R.string.profesionP9,
                        R.drawable.manos,
                        R.string.estadocivilP9
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP10,
                        R.string.descripcionP10,
                        R.string.edadP10,
                        R.string.profesionP10,
                        R.drawable.fiebre,
                        R.string.estadocivilP10
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP11,
                        R.string.descripcionP11,
                        R.string.edadP11,
                        R.string.profesionP11,
                        R.drawable.estomacal,
                        R.string.estadocivilP11
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP12,
                        R.string.descripcionP12,
                        R.string.edadP12,
                        R.string.profesionP12,
                        R.drawable.refriados,
                        R.string.estadocivilP12
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP13,
                        R.string.descripcionP13,
                        R.string.edadP13,
                        R.string.profesionP13,
                        R.drawable.rodilla,
                        R.string.estadocivilP13
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP14,
                        R.string.descripcionP14,
                        R.string.edadP14,
                        R.string.profesionP14,
                        R.drawable.espalda,
                        R.string.estadocivilP14
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP15,
                        R.string.descripcionP15,
                        R.string.edadP15,
                        R.string.profesionP15,
                        R.drawable.vientre,
                        R.string.estadocivilP15
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP16,
                        R.string.descripcionP16,
                        R.string.edadP16,
                        R.string.profesionP16,
                        R.drawable.abdominal,
                        R.string.estadocivilP16
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP17,
                        R.string.descripcionP17,
                        R.string.edadP17,
                        R.string.profesionP17,
                        R.drawable.acne,
                        R.string.estadocivilP17
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP18,
                        R.string.descripcionP18,
                        R.string.edadP18,
                        R.string.profesionP18,
                        R.drawable.apendecitis,
                        R.string.estadocivilP18
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP19,
                        R.string.descripcionP19,
                        R.string.edadP19,
                        R.string.profesionP19,
                        R.drawable.asma,
                        R.string.estadocivilP19
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP20,
                        R.string.descripcionP20,
                        R.string.edadP20,
                        R.string.profesionP20,
                        R.drawable.colicos,
                        R.string.estadocivilP20
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP21,
                        R.string.descripcionP21,
                        R.string.edadP21,
                        R.string.profesionP21,
                        R.drawable.conjuntivitis,
                        R.string.estadocivilP21
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP22,
                        R.string.descripcionP22,
                        R.string.edadP22,
                        R.string.profesionP22,
                        R.drawable.diarrea,
                        R.string.estadocivilP22
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP23,
                        R.string.descripcionP23,
                        R.string.edadP23,
                        R.string.profesionP23,
                        R.drawable.infeccion,
                        R.string.estadocivilP23
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP24,
                        R.string.descripcionP24,
                        R.string.edadP24,
                        R.string.profesionP24,
                        R.drawable.migrana,
                        R.string.estadocivilP24
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP25,
                        R.string.descripcionP25,
                        R.string.edadP25,
                        R.string.profesionP25,
                        R.drawable.neumonia,
                        R.string.estadocivilP25
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP26,
                        R.string.descripcionP26,
                        R.string.edadP26,
                        R.string.profesionP26,
                        R.drawable.varicela,
                        R.string.estadocivilP26
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP27,
                        R.string.descripcionP27,
                        R.string.edadP26,
                        R.string.profesionP26,
                        R.drawable.alergia,
                        R.string.estadocivilP26
                )
        );

        PERSONAS_LIST.add(new Personas(R.string.nombreP28,
                        R.string.descripcionP28,
                        R.string.edadP28,
                        R.string.profesionP28,
                        R.drawable.nauceas,
                        R.string.estadocivilP28
                )
        );
    }

    public int getNombre_Persona() {
        return Nombre_Persona;
    }

    public int getDescripcion_Persona() {
        return Descripcion_Persona;
    }

    public int getEdad_Persona() {
        return Edad_Persona;
    }

    public int getProfesion_Persona() {
        return Profesion_Persona;
    }

    public int getImg_persona() {
        return Img_persona;
    }

    public int getEstadoCivil_persona() {
        return EstadoCivil_persona;
    }


}

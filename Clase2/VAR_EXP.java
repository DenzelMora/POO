public class VAR_EXP {

    public static void main(String[] args){

        float 
        d1 = 42.0f, d2 = 58.5f, d3 = 37.2f,
        t1 = 0.9f, t2 = 1.4f, t3 = 0.8f,
        l1 = 5.1f, l2 = 6.9f, l3 = 4.3f,
        precioLitro = 1.35f,
        masaCargaKg = 1200f,
        largo = 2.0f,
        ancho = 1.2f,
        alto = 1.1f,
        p1 = 2.5f,
        p2 = 3.0f,
        p3 = 2.0f,
        deprecPorKm = 0.08f,
        volCamionM3 = 10.0f,
        fCO2 = 2.68f,
        galPorLitro = 0.264172f,
        vmin = 30f,
        vmax = 90f,
        va = 40f,
        vb = 80f,
        ca = 0.05f,
        cb = 0.09f,
        a = -0.0008f,
        b = 0.08f,
        c = 4.0f;

        //Mostrar todas las variables
        System.out.println("");
        System.out.println("********************");
        System.out.println("");
        System.out.println("Variables:");
        System.out.println("d1 = "+d1);
        System.out.println("d2 = "+d2);
        System.out.println("d3 = "+d3);
        System.out.println("t1 = "+t1);
        System.out.println("t2 = "+t2);
        System.out.println("t3 = "+t3);
        System.out.println("l1 = "+l1);
        System.out.println("l2 = "+l2);
        System.out.println("l3 = "+l3);
        System.out.println("precioLitro = "+precioLitro);
        System.out.println("masaCargaKg = "+masaCargaKg);
        System.out.println("largo = "+largo);
        System.out.println("ancho = "+ancho);
        System.out.println("alto = "+alto);
        System.out.println("p1 = "+p1);
        System.out.println("p2 = "+p2);
        System.out.println("p3 = "+p3);
        System.out.println("deprecPorKm = "+deprecPorKm);
        System.out.println("volCamionM3 = "+volCamionM3);
        System.out.println("fCO2 = "+fCO2);
        System.out.println("galPorLitro = "+galPorLitro);
        System.out.println("vmin = "+vmin);
        System.out.println("vmax = "+vmax);
        System.out.println("va = "+va);
        System.out.println("vb = "+vb);
        System.out.println("ca = "+ca);
        System.out.println("cb = "+cb);
        System.out.println("a = "+a);
        System.out.println("b = "+b);
        System.out.println("c = "+c);

        // Calcular velocidad
        float v1 = d1/t1;
        float v2 = d2/t2;
        float v3 = d3/t3;
        float vprom = (d1*v1 + d2*v2 + d3*v3) / (d1 + d2 + d3);
        float kml1 = d1/l1,kml2 = d2/l2,kml3 = d3/l3,kml_total = (d1+d2+d3)/(l1+l2+l3);

        System.out.println("");
        System.out.println("********************");
        System.out.println("");
        System.out.println("VELOCIDADES Y RENDIMIENTO:");
        System.out.println("v1 = "+v1);
        System.out.println("v2 = "+v2);
        System.out.println("v3 = "+v3);
        System.out.println("vprom = "+vprom);
        System.out.println("kml1 = "+kml1);
        System.out.println("kml2 = "+kml2);
        System.out.println("kml3 = "+kml3);
        System.out.println("kml_total = "+kml_total);

        //COSTOS DIRECTOS
        float costoComb = (l1+l2+l3) * precioLitro;
        float deprec = (d1+d2+d3) * deprecPorKm;
        float peajes = p1+p2+p3;
        float costoDirecto = costoComb + deprec + peajes;
        float costoPorKm = costoDirecto / (d1 + d2 + d3);

        System.out.println("");
        System.out.println("********************");
        System.out.println("");
        System.out.println("COSTOS DIRECTOS:");
        System.out.println("costoComb = "+costoComb);
        System.out.println("Deprec = "+deprec);
        System.out.println("Peajes = "+peajes);
        System.out.println("costoDirecto = "+costoDirecto);
        System.out.println("costoPorKm = "+costoPorKm);


        //VOLUMEN, DENSIDAD Y OCUPACION

        float volumenM3 = largo * ancho * alto;
        float densidadKgM3 = masaCargaKg / volumenM3;
        float ocupacion = (volCamionM3 / volumenM3) * 100;

        System.out.println("");
        System.out.println("********************");
        System.out.println("");
        System.out.println("VOLUMEN, DENSIDAD Y OCUPACION:");
        System.out.println("volumen = "+volumenM3);
        System.out.println("densidad = "+densidadKgM3);
        System.out.println("ocupacion = "+ocupacion);

        //EMISIONES DE CO2

        float CO2_TOTAL = (l1+l2+l3) * fCO2;
        float CO2_por_km = CO2_TOTAL / (d1 + d2 + d3);

        System.out.println("");
        System.out.println("********************");
        System.out.println("");
        System.out.println("EMISIONES DE CO2:");
        System.out.println("CO2_TOTAL = "+CO2_TOTAL);
        System.out.println("CO2_por_km = "+CO2_por_km);

        //CONVERSIONES Y NORMALIZACION

        float v_ms_prom = vprom * 1000 / 3600;
        float galTot = (l1 + l2 + l3) / galPorLitro;
        float v_norm = (vprom - vmin) / (vmax - vmin);
        System.out.println("");
        System.out.println("********************");
        System.out.println("");
        System.out.println("CONVERSIONES Y NORMALIZACION:");
        System.out.println("v_ms_prom = "+v_ms_prom);
        System.out.println("galTot = "+galTot);
        System.out.println("v_norm = "+v_norm);

        //INTERPOLACION LINEAL

        float c_vprom = ca +(cb - ca) * (vprom - va) / (vb - va);
        float costo_Mant = c_vprom * (d1 + d2 + d3);

        System.out.println("");
        System.out.println("********************");
        System.out.println("");
        System.out.println("INTERPOLACION LINEAL:");
        System.out.println("c_vprom = "+c_vprom);
        System.out.println("costo_Mant = "+costo_Mant);

        //MODELO POLINOMICO DE RENDIMIENTO 

        double kml_v = a*Math.pow(v_ms_prom,2 ) + b*v_ms_prom + c;
        double kmlModelo = kml_v;
        double litrosModelo = d1 + d2 + d3/ kmlModelo;
        System.out.println("");
        System.out.println("********************");
        System.out.println("");
        System.out.println("MODELO POLINOMICO DE RENDIMIENTO:");
        System.out.println("kmlModelo = "+kmlModelo);
        System.out.println("litrosModelo = "+litrosModelo);

        //INDICE DE EFICIENCIA
        double w1 = 0.25;
        double w2 = 0.25;
        double w3 = 0.25;

        double score = w1 * 1/costoPorKm + w2*kml_total + w3 * 1/CO2_por_km + w4 * 1/18;
    }
}    
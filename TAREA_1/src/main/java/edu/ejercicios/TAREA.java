package edu.ejercicios;

public class TAREA {
    public static void (String[] args) {
        double radio, longitudLado, base, altura, areaBase, alturaPrisma, alturaCilindro;

        // 1. Área de un círculo
        radio = 5.0; // Cambiar el valor del radio según el círculo que desees calcular
        double areaCirculo = Math.PI * Math.pow(radio, 2);
        System.out.println("Área del círculo: " + areaCirculo);

        // 2. Circunferencia de un círculo
        double circunferencia = 2 * Math.PI * radio;
        System.out.println("Circunferencia del círculo: " + circunferencia);

        // 3. Volumen de un cubo
        longitudLado = 4.0; // Cambiar el valor de la longitud del lado según el cubo que desees calcular
        double volumenCubo = Math.pow(longitudLado, 3);
        System.out.println("Volumen del cubo: " + volumenCubo);

        // 4. Área de una pirámide cuadrada
        base = 6.0; // Cambiar el valor de la longitud de la base según la pirámide que desees calcular
        altura = 8.0; // Cambiar el valor de la altura según la pirámide que desees calcular
        double areaPiramide = (base * altura) / 2;
        System.out.println("Área de la pirámide cuadrada: " + areaPiramide);

        // 5. Volumen de una pirámide cuadrada
        double volumenPiramide = (base * altura) / 3;
        System.out.println("Volumen de la pirámide cuadrada: " + volumenPiramide);

        // 6. Área de un triángulo
        double baseTriangulo = 10.0; // Cambiar el valor de la longitud de la base según el triángulo que desees calcular
        double alturaTriangulo = 5.0; // Cambiar el valor de la altura según el triángulo que desees calcular
        double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
        System.out.println("Área del triángulo: " + areaTriangulo);

        // 7. Volumen de un prisma rectangular
        areaBase = 15.0; // Cambiar el valor del área de la base según el prisma que desees calcular
        alturaPrisma = 8.0; // Cambiar el valor de la altura según el prisma que desees calcular
        double volumenPrisma = areaBase * alturaPrisma;
        System.out.println("Volumen del prisma rectangular: " + volumenPrisma);

        // 8. Área de un paralelogramo
        double baseParalelogramo = 7.0; // Cambiar el valor de la longitud de la base según el paralelogramo que desees calcular
        double alturaParalelogramo = 9.0; // Cambiar el valor de la altura según el paralelogramo que desees calcular
        double areaParalelogramo = baseParalelogramo * alturaParalelogramo;
        System.out.println("Área del paralelogramo: " + areaParalelogramo);

        // 9. Volumen de un cilindro
        radio = 4.0; // Cambiar el valor del radio según el cilindro que desees calcular
        alturaCilindro = 10.0; // Cambiar el valor de la altura según el cilindro que desees calcular
        double volumenCilindro = Math.PI * Math.pow(radio, 2) * alturaCilindro;
        System.out.println("Volumen del cilindro: " + volumenCilindro);

        // 10. Área de una esfera
        radio = 3.0; // Cambiar el valor del radio según la esfera que desees calcular
        double areaEsfera = 4 * Math.PI * Math.pow(radio, 2);
        System.out.println("Área de la esfera: " + areaEsfera);
    }
}




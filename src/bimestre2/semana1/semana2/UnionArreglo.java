package bimestre2.semana1.semana2;

public class UnionArreglo {
    public static void main(String[] args) {
        String marcas1[] ={"hp","dell","asus","lenovo","toshiba"};
        String marcas2[] = {"samsung","huawei","dere"};
        int tam_arr_resultado = marcas1.length+ marcas2.length;
        String resowo[] = new String[tam_arr_resultado];
        for (int indice = 0; indice < marcas1.length; indice++) {
            resowo[indice] = marcas1[indice];
        }
        for (int indice = marcas1.length, indice2=0; indice < resowo.length; indice++,indice2++) {
            resowo[indice] = marcas2[indice2];
        }
        //copiamos los valores del arreglo marcas 2 en el arreglo resowo
        for (int indice = 0; indice < resowo.length; indice++) {
            System.out.println(resowo[indice]);
        }
    }
}
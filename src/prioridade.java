public class prioridade {
    int posx,posy,sx,sy,cima,baixo,esquerda,direita,nmrs;
    posx=4;
    posy=4;
    sx=0;
    sy=3;
    nmrs=1;
    cima=0;
    baixo=0;
    esquerda=0;
    direita=0;
    public prioridade() {
        if ((posx + sx) > (posy + sy)) {  //por condicao para quando =
            //y  primeiro
            if (posy - sy > 0) { // por condicao quando for igual
                esquerda = 4;
                direita = 2;
            } else {
                direita = 4;
                esquerda = 2;
            }
            if (posx - sx > 0) {
                cima = 3;
                baixo = 1;
            } else {
                baixo = 3;
                cima = 1;
            }


        } else if ((posx + sx) < (posy + sy)) {
            // x primeiro
            if (posx - sx > 0) {
                cima = 4;
                baixo = 2;
            } else {
                baixo = 4;
                cima = 2;
            }
            if (posy - sy > 0) {
                esquerda = 3;
                direita = 1;
            } else {
                direita = 3;
                esquerda = 1;
            }

        }
        return(cima,baixo,esquerda,direita);
    }
}

package br.com.fagnerleando.nikabot.util;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class RobotUtil {

    public static void Execute_Tab(int qtde, int segundos) {

        int x = 0;

        int segundos_tratados = segundos * 1000;

        try {

            Robot robot = new Robot();

            while (x < qtde) {

                robot.delay(segundos_tratados);
                robot.keyPress(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_TAB);

                x++;
            }

        }catch (AWTException e){

        }

    }

    public static void Execute_Enter(int qtde, int segundos) {
        
        int x = 0;
        int segundos_tratados = segundos * 1000;

        try {

           Robot robot = new Robot();

            while (x < qtde) {

                robot.delay(segundos_tratados);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);

                x++;
            }


        }catch (AWTException e){


        }


    }

    public static void Execute_BackSpace(int qtde, int segundos) {

        int x = 0;

        int segundos_tratados = segundos * 1000;

        try {

            Robot robot = new Robot();

            while (x < qtde) {

                robot.delay(segundos_tratados);
                robot.keyPress(KeyEvent.VK_BACK_SPACE);
                robot.keyRelease(KeyEvent.VK_BACK_SPACE);

                x++;
            }


        }catch (AWTException e){


        }


    }

    public static void Execute_Up(int qtde, int segundos) {

        int x = 0;

        int segundos_tratados = segundos * 1000;

        try {

            Robot robot = new Robot();

            while (x < qtde) {

                robot.delay(segundos_tratados);
                robot.keyPress(KeyEvent.VK_UP);
                robot.keyRelease(KeyEvent.VK_UP);

                x++;
            }

        }catch (AWTException e){

            

        }


    }

    public static void Execute_Down(int qtde, int segundos) {

        int x = 0;

        int segundos_tratados = segundos * 1000;

        try {

            Robot robot = new Robot();

            while (x < qtde) {

                robot.delay(segundos_tratados);
                robot.keyPress(KeyEvent.VK_DOWN);
                robot.keyRelease(KeyEvent.VK_DOWN);
                System.out.println("qtde => " + x);
                x++;
            }


        }catch (AWTException e){

            

        }


    }

    public static void Execute_Left(int qtde, int segundos) {

        int x = 0;

        int segundos_tratados = segundos * 1000;

        try {

            Robot robot = new Robot();

            while (x < qtde) {

                robot.delay(segundos_tratados);
                robot.keyPress(KeyEvent.VK_LEFT);
                robot.keyRelease(KeyEvent.VK_LEFT);

                x++;
            }


        }catch (AWTException e){


        }


    }

    public static void Execute_Right(int qtde, int segundos) {

        int x = 0;

        int segundos_tratados = segundos * 1000;

        try {

            Robot robot = new Robot();

            while (x < qtde) {

                robot.delay(segundos_tratados);
                robot.keyPress(KeyEvent.VK_RIGHT);
                robot.keyRelease(KeyEvent.VK_RIGHT);

                x++;
            }


        }catch (AWTException e){


        }


    }

    public static void Execute_Print(int qtde, int segundos) {

        int x = 0;

        int segundos_tratados = segundos * 1000;

        try {

            Robot robot = new Robot();

            while (x < qtde) {

                robot.delay(segundos_tratados);
                robot.keyPress(KeyEvent.VK_PRINTSCREEN);
                robot.keyRelease(KeyEvent.VK_PRINTSCREEN);

                x++;
            }


        }catch (AWTException e){


        }


    }

    public static void Execute_Alt_Tab(int qtde, int segundos) {

        int x = 0;

        int segundos_tratados = segundos * 1000;

        try {

            Robot robot = new Robot();

            while (x < qtde) {

                robot.delay(segundos_tratados);

                robot.keyPress(KeyEvent.VK_ALT);
                robot.keyPress(KeyEvent.VK_TAB);

                robot.keyRelease(KeyEvent.VK_TAB);
                robot.keyRelease(KeyEvent.VK_ALT);


                x++;
            }


        }catch (AWTException e){


        }


    }

    public static void Execute_Ctrl_T(int qtde, int segundos) {

        int x = 0;

        int segundos_tratados = segundos * 1000;

        try {

            Robot robot = new Robot();

            while (x < qtde) {

                robot.delay(segundos_tratados);

                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_T);

                robot.keyRelease(KeyEvent.VK_T);
                robot.keyRelease(KeyEvent.VK_CONTROL);


                x++;
            }


        }catch (AWTException e){


        }


    }

    public static void Execute_Ctrl_C(int qtde, int segundos) {

        int x = 0;

        int segundos_tratados = segundos * 1000;

        try {

            Robot robot = new Robot();

            while (x < qtde) {

                robot.delay(segundos_tratados);

                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_C);

                robot.keyRelease(KeyEvent.VK_C);
                robot.keyRelease(KeyEvent.VK_CONTROL);


                x++;
            }


        }catch (AWTException e){


        }


    }

    public static void Execute_Ctrl_V(int qtde, int segundos) {

        int x = 0;

        int segundos_tratados = segundos * 1000;

        try {

            Robot robot = new Robot();

            while (x < qtde) {

                robot.delay(segundos_tratados);

                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_V);

                robot.keyRelease(KeyEvent.VK_V);
                robot.keyRelease(KeyEvent.VK_CONTROL);


                x++;
            }


        }catch (AWTException e){


        }


    }

    public static void Execute_Ctrl_S(int qtde, int segundos) {

        int x = 0;

        int segundos_tratados = segundos * 1000;

        try {

            Robot robot = new Robot();

            while (x < qtde) {

                robot.delay(segundos_tratados);

                robot.keyPress(KeyEvent.VK_CONTROL);
                robot.keyPress(KeyEvent.VK_S);

                robot.keyRelease(KeyEvent.VK_S);
                robot.keyRelease(KeyEvent.VK_CONTROL);


                x++;
            }


        }catch (AWTException e){


        }


    }

    public static void Execute_Alt_F4(int qtde, int segundos) {

        int x = 0;

        int segundos_tratados = segundos * 1000;

        try {

            Robot robot = new Robot();

            while (x < qtde) {

                robot.delay(segundos_tratados);

                robot.keyPress(KeyEvent.VK_ALT);
                robot.keyPress(KeyEvent.VK_F4);

                robot.keyRelease(KeyEvent.VK_F4);
                robot.keyRelease(KeyEvent.VK_ALT);


                x++;
            }


        }catch (AWTException e){


        }


    }

    public static void Execute_Iniciar(int qtde, int segundos) {

        int x = 0;

        int segundos_tratados = segundos * 1000;

        try {

            Robot robot = new Robot();

            while (x < qtde) {

                robot.delay(segundos_tratados);

                robot.keyPress(KeyEvent.VK_WINDOWS);
                robot.keyRelease(KeyEvent.VK_WINDOWS);


                x++;
            }


        }catch (AWTException e){


        }


    }

    public static void Execute_Aguardar(int qtde, int segundos) {

        int x = 0;

        int segundos_tratados = segundos * 1000;

        try {

            Robot robot = new Robot();

            while (x < qtde) {

                robot.delay(segundos_tratados);
                System.out.println("SEGUNDOS => " + x);

                x++;
            }


        }catch (AWTException e){


        }


    }

    public static boolean Retorna_Topo() {

        int x = 0;

        boolean status_tarefa = false;

        int segundos_tratados =0;

        try {

            Robot robot = new Robot();

            System.out.println("INICIOU O RETORNA AO TOPO");

            while (x < 100) {

                robot.delay(segundos_tratados);
                robot.keyPress(KeyEvent.VK_UP);
                robot.keyRelease(KeyEvent.VK_UP);

                x++;
            }

            status_tarefa = true;
            System.out.println("FINALIZOU O RETORNA AO TOPO");

        }catch (AWTException e){}

        return status_tarefa;
    }

    public static boolean Faz_Print(String pasta){

        boolean status_de_execucao = false;

            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss")
                    .format(Calendar.getInstance().getTime());

            BufferedImage image = null;
            try {
                image = new Robot()
                        .createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
            } catch (AWTException e) {
            }
            try {
                ImageIO.write(
                        image,
                        "png",
                        new File(
                                "C:\\PrintGO\\"+"\\"+pasta+"\\"
                                        + timeStamp
                                        + ".png"));
                System.out.println("PASSOU POR AQUI E FEZ O PRINT");
                status_de_execucao = true;

            } catch (
                    IOException e) {
            }

        return status_de_execucao;

    }

    public static boolean Faz_Print(){

        boolean status_de_execucao = false;

        String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss")
                .format(Calendar.getInstance().getTime());

        BufferedImage image =
                null;
        try {
            image = new Robot()
                    .createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
        } catch (AWTException e) {
        }
        try {
            ImageIO.write(
                    image,
                    "png",
                    new File(
                            "C:\\PrintGO\\"
                                    + timeStamp
                                    + ".png"));
            System.out.println("PASSOU POR AQUI E FEZ O PRINT");
            status_de_execucao = true;

        } catch (
                IOException e) {
        }

        return status_de_execucao;

    }

    public static void Executa_Comandos(int tp_comando, String texto , int qtde_repeticao, int segundos_aguardando) throws AWTException {

        switch(tp_comando) {
            case 1 -> Execute_Tab(qtde_repeticao,segundos_aguardando);
            case 2 -> Execute_Enter(qtde_repeticao,segundos_aguardando);
            case 3 -> Execute_BackSpace(qtde_repeticao,segundos_aguardando);
            case 4 -> Execute_Alt_Tab(qtde_repeticao,segundos_aguardando);
            case 5 -> Execute_Iniciar(qtde_repeticao,segundos_aguardando);
            case 6 -> Execute_Aguardar(qtde_repeticao,segundos_aguardando);
            case 7 -> Execute_Alt_F4(qtde_repeticao,segundos_aguardando);
            case 8 -> Execute_Ctrl_T(qtde_repeticao,segundos_aguardando);
            case 9 -> Execute_Print(qtde_repeticao,segundos_aguardando);
            case 10 -> Execute_Ctrl_C(qtde_repeticao,segundos_aguardando);
            case 11 -> Execute_Ctrl_V(qtde_repeticao,segundos_aguardando);
            case 12 -> Execute_Ctrl_S(qtde_repeticao,segundos_aguardando);
            case 13 -> Execute_Up(qtde_repeticao,segundos_aguardando);
            case 14 -> Execute_Down(qtde_repeticao,segundos_aguardando);
            case 15 -> Execute_Left(qtde_repeticao,segundos_aguardando);
            case 16 -> Execute_Right(qtde_repeticao,segundos_aguardando);
            case 18 -> Faz_Print();

        }
//            case 0: Digitar(texto);break;
        
    }

    
}
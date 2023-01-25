package src;
import src.Sala;
public class Main {
    public static void main(String []args){

        //criando salas UAC
        Sala salaI1= new Sala(40,"I1");
        Sala salaI2= new Sala(60,"I2");
        Sala salaI3= new Sala(60,"I3");
        Sala salaI4= new Sala(40,"I4");
        Sala salaI5= new Sala(40,"I5");
        Sala salaI6= new Sala(40,"I6");
        Sala salaI7= new Sala(40,"I7");
        Sala salaI8= new Sala(40,"I8");
        Sala salaI9= new Sala(130,"I9");
        Sala anteSala=new Sala(20,"Ante-Sala");
        Sala salaS1= new Sala(130,"S1");
        Sala salaS2= new Sala(130,"S2");
        Sala salaS3= new Sala(130,"S3");
        Sala salaS4= new Sala(130,"S4");
        Sala salaS5= new Sala(40,"S5");
        Sala salaS6= new Sala(60,"S6");
        Sala salaS7= new Sala(60,"S7");
        Sala salaS8= new Sala(40,"S8");
        Sala salaS9= new Sala(130,"S9");
        Sala salas10=new Sala(25,"Sala Multiuso");
        Sala auditorio=new Sala(240,"Auditorio");
        //Criando salas UAC laboratórios
        //mocap deveria ser software
        LabInformatica LabI10 =new LabInformatica(80,"I10",75,"Informatica");
        LabInformatica LabS10= new LabInformatica(80,"S10",75,"Informatica");
        //Criando salas UED labs
        laboratorio LabQuimica=new laboratorio(20,"Laboratorio Quimica","Engenharias");
        laboratorio LabFisica1=new laboratorio(25,"Laboratorio Fisica1","Engenharias");
        laboratorio LabFisica2=new laboratorio(25,"Laboratorio Fisica2","Engenharias");
        laboratorio LabTermofluidos=new laboratorio(25,"Laboratorio Termofluidos","Aeroespacial");
        laboratorio LabTermodinamica=new laboratorio(25,"Laboratorio Termodinamica","Aeroespacial");
        laboratorio LabMateriais=new laboratorio(15,"Laboratorio Materiais","Aeroespacial");
        laboratorio LabMocap=new laboratorio(60,"Mocap","Software");
        //Criando labs eletronica
        LabEletronica LabNei=new LabEletronica(20,"Laboratorio Nei",18,"Eletronica");
        LabEletronica LabNei2=new LabEletronica(20,"Laboratorio Nei2",19,"Eletronica");
        LabEletronica LabSS= new LabEletronica(45,"Laboratorio SS",40,"Eletronica");
        LabEletronica LabElet=new LabEletronica(20,"Laboratorio Eletricidade",19,"Eletronica");
        //Criando salas LDTEA
        Sala Salareuniao=new Sala(40,"Sala de Reuniao 1");
        Sala Sala2=new Sala(40,"Sala 2");
        Sala Sala3=new Sala(40,"Sala 3");
        //Criando containers
        Sala Cont4=new Sala(30,"Container N°4");
        Sala Cont8=new Sala(30,"Container N°8 Lab SHP");
        Sala Cont17=new Sala(30,"Container N°17");

        //Criando Predios
        Predio UAC=new Predio(22,"Unidade Academica ");
        Predio UED=new Predio(11,"Unidade de Ensino e Docência");
        Predio LDTEA=new Predio(3,"Laboratorios");



    }

}

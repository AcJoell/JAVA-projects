package prestamos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class prestamo {
    public int codigo;
    public String codigoEstudiante;
    public String codigoLibro;
    public String fecha;

    public prestamo() {
    }

    public prestamo(int codigo, String codigoEstudiante, String codigoLibro, String fecha) {
        this.codigo = codigo;
        this.codigoEstudiante = codigoEstudiante;
        this.codigoLibro = codigoLibro;
        this.fecha = fecha;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCodigoEstudiante() {
        return codigoEstudiante;
    }

    public void setCodigoEstudiante(String codigoEstudiante) {
        this.codigoEstudiante = codigoEstudiante;
    }

    public String getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(String codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public boolean create(String stu, String lib, String fec) {
        boolean resultado = false;
        data joinDB = new data();
        Connection enter = joinDB.conectando();
        
        try{
            String code = "select * from tbprestamo where prestLib ='"+lib+"'";
            Statement statement = enter.createStatement();
            ResultSet result = statement.executeQuery(code);
            if(result.next()){
                JOptionPane.showMessageDialog(null, "El prestamo ya existe");
            } else {
                String code2 = "insert into tbprestamo (prestEstu, prestLib, prestFech) value(?,?,?)";
                PreparedStatement prepared = enter.prepareCall(code2);
                prepared.setString(1, stu);
                prepared.setString(2, lib);
                prepared.setString(3, fec);
                resultado = prepared.executeUpdate()>0;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al crear el prestamo\n"+e);
        }
        
        return resultado;
    }
    
    public ResultSet read(){
        data joinDB = new data();
        Connection enter = joinDB.conectando();
        ResultSet result = null;
        
        try{
            String code = "select * from tbprestamo;";
            Statement statement = enter.createStatement();
            result = statement.executeQuery(code);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "¡Error en la consulta! "+e);
        }
        return result;
    }

    public boolean update(String fec, String cod){
        boolean resultado = false;
        data joinDB = new data();
        Connection enter = joinDB.conectando();
        
        try{
            String code = "update tbprestamo set prestFech=? where prestId=?";
            PreparedStatement prepared = enter.prepareStatement(code);
            prepared.setString(1, fec);
            prepared.setString(2, cod);
            resultado = prepared.executeUpdate()>0;
            enter.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,"Error al actualizar"+e);
        }
        return resultado;
    }
    
    public boolean delete(String cod){
        boolean resultado = false;
        data joinDB = new data();
        Connection enter = joinDB.conectando();
        
        try{
            Statement statement = enter.createStatement();
            String code = "select * from tbprestamo where prestId='"+cod+"'";
            ResultSet result = statement.executeQuery(code);
            if(result.next()){
                String code2 = "delete from tbprestamo where prestId=?";
                PreparedStatement prepared = enter.prepareStatement(code2);
                prepared.setString(1, cod);
                resultado = prepared.executeUpdate()>0;
                JOptionPane.showMessageDialog(null, cod+" se ha eliminado con exito");
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "El prestamo no existe");
        }
        
        return resultado;
    }
    
}

/*
    public boolean update(String stu, String lib, String fec, String cod){
        boolean resultado = false;
        data joinDB = new data();
        Connection enter = joinDB.conectando();
        
        try{
            String code = "update tbprestamo set prestEstu=?, prestLib=?, prestFech=? where prestId=?";
            PreparedStatement prepared = enter.prepareStatement(code);
            prepared.setString(1, stu);
            prepared.setString(2, lib);
            prepared.setString(3, fec);
            prepared.setString(4, cod);
        }
        catch(Exception e){
        
        }
        return resultado;
    }
*/
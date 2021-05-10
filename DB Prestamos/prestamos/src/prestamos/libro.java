package prestamos;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class libro {
    private String codigo;
    private String titulo;
    private String editorial;
    private String autor;
    private int paginas;

    public libro() {
    }

    public libro(String codigo, String titulo, String editorial, String autor, int paginas) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.editorial = editorial;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
    
    public boolean create(String cod, String ttl, String edi, String aut, int pag, String foto){
        boolean resultado = false;
        data joinDB = new data();
        Connection enter = joinDB.conectando();
        
        try{
            String code = "select * from tblibro where libId ='"+cod+"'";
            Statement statement = enter.createStatement();
            ResultSet result = statement.executeQuery(code);
            if(result.next()){
                JOptionPane.showMessageDialog(null,"El libro ya existe");
            }
            else{
                String code2 = "insert into tblibro value(?,?,?,?,?,?);";
                PreparedStatement prepared = enter.prepareCall(code2);
                prepared.setString(1, cod);
                prepared.setString(2, ttl);
                prepared.setString(3, edi);
                prepared.setString(4, aut);
                prepared.setInt(5, pag);
                
                FileInputStream campo_foto = new FileInputStream(foto); // pasar la imagen
                prepared.setBinaryStream(6, campo_foto, (int)foto.length()); // Decodificar y enviarla a MySQL
                
                resultado = prepared.executeUpdate()>0;
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(null,"Error al crear el libro\n"+e);
        }
        
        return resultado;
    }
    
    public ResultSet read(){
        data joinDB = new data();
        Connection enter = joinDB.conectando();
        ResultSet result = null;
        
        try{
            String code = "select * from tblibro;";
            Statement statement = enter.createStatement();
            result = statement.executeQuery(code);
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "¡Error en la consulta! "+e);
        }
        return result;
    }
    
    public boolean update(String cod, String ttl, String edi, String aut, int pag, String foto){
        boolean resultado = false;
        data joinDB = new data();
        Connection enter = joinDB.conectando();
        
        try{
            String code = "update tblibro set libTtl=?, libEdit=?, ibAutor=?, libPags=?, libFoto=? where libId=?";
            PreparedStatement prepared = enter.prepareStatement(code);
            prepared.setString(1, ttl);
            prepared.setString(2, edi);
            prepared.setString(3, aut);
            prepared.setInt(4, pag);
            
            FileInputStream campo_foto = new FileInputStream(foto); // pasar la imagen
            prepared.setBinaryStream(5, campo_foto, (int)foto.length()); // Decodificar y enviarla a MySQL
            
            prepared.setString(6, cod);
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
            String code = "select * from tblibro where libId='"+cod+"'";
            ResultSet result = statement.executeQuery(code);
            if(result.next()){
                String code2 = "delete from tblibro where libId=?";
                PreparedStatement prepared = enter.prepareStatement(code2);
                prepared.setString(1, cod);
                resultado = prepared.executeUpdate()>0;
                JOptionPane.showMessageDialog(null, cod+" se ha eliminado con exito");
            }
        } catch(Exception e){
            JOptionPane.showMessageDialog(null, "El libro no existe"+e);
        }
        
        return resultado;
    }
    
    public void loadCombo(JComboBox<libro>lib){
        data joinDB = new data();
        Connection enter = joinDB.conectando();
        String code = "select * from tblibro";
        try{
            Statement statement = enter.createStatement();
            ResultSet result = statement.executeQuery(code);
            while(result.next()){
                lib.addItem(new libro(result.getString(1), result.getString(2), result.getString(3), result.getString(4), result.getInt(5)));
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "No se pueden cargar el JComboBox de los libros. "+e);
        }
    }

    @Override
    public String toString() {
        return ""+codigo;
    }
    
    
}
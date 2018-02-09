package Controller;
import Dao.LivroDao;
import Dao.LivroDaoImp;
import Model.Livro;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
/**
 A mudança realizada nesta classe está nos métodos deixarem de retornar uma String com a página de destino.
  Eles passam a não retornar nada e também passam a receber como parâmetro um objeto ActionEvent. 
  Isso acontece porque o objetivo agora é apenas realizar algumas mudanças no servidor e depois atualizar 
 */ 
@ManagedBean
@SessionScoped
public class LivroController {
 
private Livro livro;
private DataModel listaLivros;
 
public DataModel getListarLivros() {
List<livro> lista = new LivroDaoImp().list();
listaLivros = new ListDataModel(lista);
return listaLivros;
}
 
public Livro getLivro() {
return livro;
}
 
public void setLivro(Livro livro) {
this.livro = livro;
}
 
public void prepararAdicionarLivro(ActionEvent actionEvent){
livro = new Livro();
}
 
public void prepararAlterarLivro(ActionEvent actionEvent){
livro = (Livro)(listaLivros.getRowData());
}
//remover um livro.
public String excluirLivro(){
 
Livro livroTemp = (Livro)(listaLivros.getRowData());
LivroDao dao = new LivroDaoImp();
dao.remove(livroTemp);
return "index";
 
}
//Adiconar um livro.
public void adicionarLivro(ActionEvent actionEvent){
 
LivroDao dao = new LivroDaoImp();
dao.save(livro);
 
}
//Alterar um livro.
public void alterarLivro(ActionEvent actionEvent){
 
LivroDao dao = new LivroDaoImp();
dao.update(livro);
 
}
 
}
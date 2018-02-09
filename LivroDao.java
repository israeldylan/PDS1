package Dao;
 
import Model.Livro;
import java.util.List;
/**
O pacote Dao vai realizar a comunicação com o banco utilizando o hibernate para salvar, listar alterar e excluir livros. 
Dentro deste pacote, deve ser criada uma interface chamada LivroDao, uma classe chamada LivroDaoImp e uma classe chamada HibernateUtil 

*/
public interface LivroDao {
 
public void save(Livro livro);
public Livro getLivro(long id);
public List<livro> list();
public void remove(Livro livro);
public void update(Livro livro);
 
}
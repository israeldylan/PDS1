package Utils;
 
import Model.Livro;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.SessionFactory;
 
public class HibernateUtil {
 
private static SessionFactory sessionFactory;
 
private HibernateUtil() {
}
//configura��o de reposit�rio de dados usando o hibernate.
public static SessionFactory getSessionFactory() {
if (sessionFactory == null) {
try {
AnnotationConfiguration ac = new AnnotationConfiguration();
ac.addAnnotatedClass(Livro.class);
sessionFactory = ac.configure().buildSessionFactory();
} catch (Throwable ex) {
// Log de exce��o
System.err.println("Falha." + ex);
throw new ExceptionInInitializerError(ex);
}
return sessionFactory;
} else {
return sessionFactory;
}
}
}
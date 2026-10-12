package ma.youcode.clicktrack.dao;

public interface LienDao {
    public Lien findById(int id);
    public List<Lien> findAll();
    public void save(Lien lien);
}
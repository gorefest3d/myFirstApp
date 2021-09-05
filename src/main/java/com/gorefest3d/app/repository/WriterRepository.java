package main.java.com.gorefest3d.app.repository;

import main.java.com.gorefest3d.app.model.Writer;

public interface WriterRepository extends GenericRepository<Writer, Long> {
    void save(Writer writer, Long id);
//    void read();
//    void update();
//    void delete();

}

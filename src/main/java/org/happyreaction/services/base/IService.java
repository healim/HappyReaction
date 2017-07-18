package org.happyreaction.services.base;

import java.util.List;

import org.happyreaction.model.base.IEntity;
import org.happyreaction.model.helper.SearchConfig;


/**
 * Base service interface with all provided methods.
 *
 * @author Ignas
 *
 * @param <T> Type of Service.
 */
public interface IService<T extends IEntity> {

    /**
     * Add entity.
     *
     * @param entity
     *            to add
     */
    void add(T entity);

    /**
     * Update entity.
     *
     * @param entity
     *            to update
     */
    void update(T entity);

    /**
     * Delete entity.
     *
     * @param entity
     *            to delete
     */
    void delete(T entity);

    /**
     * Delete entity by its id.
     *
     * @param id
     *            entity id to delete
     */
    void delete(Long id);

    /**
     * Delete many entities provided with list of ids.
     *
     * @param ids
     *            to delete
     */
    void deleteMany(Iterable<Long> ids);

    /**
     * Get entity by ID.
     *
     * @param id Id
     */
    T findById(Long id);

    /**
     * Load entity and eager fetch its fields.
     *
     * @param id
     *            entity Id
     * @param fetchFields
     *            String list of field names that needs to be eager fetched
     */
    T findById(Long id, List<String> fetchFields);

    /**
     * @return count of all entities in db.
     */
    long count();

    /**
     * @param config
     *            Pagination/sorting/filtering data.
     * @return count of # entities in db.
     */
    long count(SearchConfig config);

    /**
     * Get All entities from db.
     *
     * @return List - entities list
     */
    List<T> list();

    /**
     * Get entries according to pagination/sorting/filtering data in
     * PaginationConfiguration.
     *
     * @param config
     *            Pagination/sorting/filtering data.
     *
     * @return List - entities list
     */
    List<T> list(SearchConfig config);

}
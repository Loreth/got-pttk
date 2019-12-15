package po.grupa2.ksiazeczkagot.service;

import po.grupa2.ksiazeczkagot.persistance.Identifiable;

public interface SpecificationCrudService<T, U extends Identifiable<ID>, ID>
    extends CrudService<T, ID>, SpecificationReadService<T, U, ID> {}

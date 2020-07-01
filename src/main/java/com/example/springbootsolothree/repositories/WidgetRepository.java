package com.example.springbootsolothree.repositories;
import com.example.springbootsolothree.domain.Widget;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by DW 07/01/20
 */
public interface WidgetRepository extends CrudRepository<Widget, Long> {
}

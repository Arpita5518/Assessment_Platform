package com.nucleusteq.asessmentPlatform.service;

import java.util.List;
import com.nucleusteq.asessmentPlatform.dto.CategoryDto;

/**
 * The CategoryService interface defines methods for managing user-related
 * operations.
 */
public interface CategoryService {

    /**
     * Adds a new category.
     *
     * @param category The CategoryDto object representing the category to be
     *                 added.
     * @return The CategoryDto object representing the added category.
     */
    CategoryDto addCategory(CategoryDto category);

    /**
     * Retrieves a list of all categories.
     *
     * @return A list of CategoryDto objects representing all categories.
     */
    List<CategoryDto> getAllCategories();

    /**
     * Retrieves a category by its ID.
     *
     * @param id The ID of the category to retrieve.
     * @return The CategoryDto object representing the retrieved category.
     */
    CategoryDto getCategoryById(int id);

    /**
     * Updates a category by its ID.
     *
     * @param category The CategoryDto object containing updated category
     *                 details.
     * @param id       The ID of the category to update.
     * @return The CategoryDto object representing the updated category.
     */
    String updateCategory(CategoryDto category, int id);

    /**
     * Deletes a category by its ID.
     *
     * @param id The ID of the category to delete.
     * @return A message indicating the result of the deletion operation.
     */
    String deleteCategory(int id);

//    List<Quiz> getAllQuizByCategory(int categoryId);
}

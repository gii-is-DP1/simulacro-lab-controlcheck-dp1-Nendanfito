<%@ page session="false" trimDirectiveWhitespaces="true" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="petclinic" tagdir="/WEB-INF/tags" %>

<petclinic:layout pageName="product">
    <h2>
        Añadir Producto
    </h2>
    <form:form modelAttribute="product" class="form-horizontal" id="add-product-form">
        <div class="form-group has-feedback">
            <petclinic:inputField label="Nombre: " name="name"/>
            <petclinic:select label="Tipo de Producto:" name="roductType"></petclinic:select>
            <petclinic:options items="${productTypes}"></form:options>
            </petclinic:select>
            <petclinic:inputField label="Precio: " name="price"/>
     
        </div>
        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button class="btn btn-default" type="submit">Añadir Producto</button>
            </div>
        </div>
    </form:form>
</petclinic:layout>

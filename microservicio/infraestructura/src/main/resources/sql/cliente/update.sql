update clientes
set nit = :nit,
	razon_social = :razonSocial,
	nombre_representante = :nombreRepresentante,
	telefono = :telefono,
	direccion = :direccion,
	correo_electronico = :email,
	fecha_modificacion = :fechaModificacion
where id = :id;
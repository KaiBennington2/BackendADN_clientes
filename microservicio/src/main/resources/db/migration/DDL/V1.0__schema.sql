CREATE TABLE CLIENTES (
    id int primary key auto_increment,
    nit varchar(20) unique not null,
    razon_social varchar(200) not null,
    nombre_representante varchar(200) not null,
    telefono varchar(20) not null,
    direccion varchar(50) not null,
    correo_electronico varchar(50) unique,
    fecha_creacion datetime not null default CURRENT_TIMESTAMP,
    fecha_modificacion datetime null
);

select
    id,
    nit,
    razon_social,
    nombre_representante,
    telefono,
    direccion,
    correo_electronico
from clientes
 where id = :id;
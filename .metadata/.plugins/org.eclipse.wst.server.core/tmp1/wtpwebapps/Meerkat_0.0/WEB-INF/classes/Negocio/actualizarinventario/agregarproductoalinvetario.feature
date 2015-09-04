Feature: Como administrador quiero agregar al inventario nuevos productos.

		Scenario: El administrador va a agregar un producto al inventario.
		Given El administrador va a agregar un producto.  
		When El producto a agregar no existe en la lista de productos.
		Then Agregar el nuevo produto.

		Scenario: El administrador va a agregar un producto al inventario.
		Given El administrador va a agregar un producto.  
		When El producto a agregar existe en la lista de productos.
		Then Adiciona el producto al inventario.
		
		Scenario: El administrador va a agregar un producto al inventario.
		Given El administrador va a agregar un producto.
		When No hay base de datos.
		Then Notificar error en la base de datos.
		
		Scenario: El administrador va a agregar un producto al inventario.
		Given El administrador va a agregar un producto.
		When Ocurre un error de bd.
		Then Notificar error en la base de datos.
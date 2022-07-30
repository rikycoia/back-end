package it.epicode.catalogo;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public interface WriteRead {
	// metodo per restituire una lista
	public List<String> read() throws IOException;

	public void write() throws IOException;
}

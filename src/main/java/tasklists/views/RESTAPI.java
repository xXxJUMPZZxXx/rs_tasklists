package tasklists.views;

import java.io.IOException;

import javax.json.Json;
import javax.json.JsonObjectBuilder;
import javax.json.JsonWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/lists")
public class RESTAPI extends HttpServlet {
	
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("application/json");
        
        // Exemplo de objeto a escrever na resposta
        Data data = new Data("code", 42.0);
        
        // Tradução para JSON
        JsonObjectBuilder jsonBuilder = Json.createObjectBuilder();
        jsonBuilder.add("name", data.getName());
        jsonBuilder.add("value", data.getValue());
        
        // Escrita da representação JSON na resposta
        JsonWriter jsonWriter = Json.createWriter(resp.getWriter());
        jsonWriter.writeObject(jsonBuilder.build());
        jsonWriter.close();
    }

    // Para dados de exemplo
    private class Data {
    	private String name;
    	private Double value;
    	
		public Data(String name, Double value) {
			super();
			this.name = name;
			this.value = value;
		}
		
		public String getName() {
			return name;
		}
		
		public Double getValue() {
			return value;
		}
    }
}


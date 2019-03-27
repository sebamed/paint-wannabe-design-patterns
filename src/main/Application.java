package main;

import main.controller.PaintController;
import main.model.ShapesModel;
import main.view.Paint;

public class Application {

	public static void main(String[] args) {
		Paint paint = new Paint(400, 400);
		ShapesModel model = new ShapesModel();

		paint.getCanvas().setModel(model);

		PaintController controller = new PaintController(model, paint);

		paint.setController(controller);
		paint.setVisible(true);
	}

}
package control;

import java.util.Collection;

import javax.enterprise.context.RequestScoped;

import model.Shelf;
import repositories.ShelfRepository;

@RequestScoped
public class ShelfControl {
	private static ShelfRepository sdtb = ShelfRepository.getInstance();


	public void createShelf(Shelf shelf) {
		sdtb.createEntity(shelf);
	}

	public Collection<Shelf> getshelfs() {
		return sdtb.getEntity();
		
	}

	public void deleteShelf(Shelf shelf) {
		sdtb.removeEntity(shelf);
		
	}

	public void editShelf(Shelf shelf) {
		if (shelf.getProductOnShelf() == null) {
			shelf.setCapability(0);
		}
		sdtb.editEntity(shelf);
		
	}

}

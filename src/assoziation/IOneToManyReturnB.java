package assoziation;

public interface IOneToManyReturnB<E> extends Iterable<E> {

	/**
	 * F�gt ein Element hinzu, falls dieses noch nicht enthalten ist.
	 * 
	 * @param elem
	 *            Das hinzuzuf�gende Element.
	 * @return True wenn L�schen erfolgreich, false bei nicht erfolg.
	 */
	public boolean add(E elem);

	/**
	 * Entfernt das Element, falls es enthalten ist.
	 * 
	 * @param elem
	 *            Das zu l�schende Element.
	 * @return True wenn L�schen erfolgreich, false bei nicht erfolg.
	 */
	public boolean remove(E elem);

	/**
	 * Pr�ft ob Elemente enthalten sind.
	 * 
	 * @return true falls keine Elemente enthalten sind, false sonst.
	 */
	public boolean isEmpty();

	/**
	 * Pr�ft ob das Element enthalten ist.
	 * 
	 * @param elem
	 *            Das zu pr�fende Element.
	 * @return true wenn das Element enthalten ist, false sonst.
	 */
	public boolean contains(E elem);

	/**
	 * Gibt die Anzahl der enthaltenen Elemente zur�ck.
	 * 
	 * @return Die Anzahl der enthaltenen Elemente.
	 */
	public int size();

	/**
	 * Entfernt alle Elemente.
	 */
	public void clear();

}

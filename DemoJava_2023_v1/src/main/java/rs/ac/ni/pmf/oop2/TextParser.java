package rs.ac.ni.pmf.oop2;

public class TextParser
{
	Encoder _encoder;
	Storage storage;
	public void setEncoder(Encoder encoder)
	{
		_encoder = encoder;
	}
	public void setStorage(Storage storage)
	{
		this.storage = storage;
	}


	public String parse(String text)
	{
		String trimmed = text.trim();
		String encoded = _encoder.encode(trimmed);
		storage.store(encoded);
		return encoded;
	}



	private void store(final String encoded)
	{
		System.out.println("Storing the value " + encoded);
	}
}

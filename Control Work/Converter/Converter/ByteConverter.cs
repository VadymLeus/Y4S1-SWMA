using System;

namespace Converter
{
    public class ByteConverter
    {
        private double _bytes;

        public ByteConverter(double valueInBytes)
        {
            this._bytes = valueInBytes;
        }

        public double ToBits()
        {
            return _bytes * 8.0;
        }

        public double ToBytes()
        {
            return _bytes;
        }

        public double ToKiloBytes()
        {
            return _bytes / 1024.0;
        }

        public double ToMegaBytes()
        {
            return _bytes / (1024.0 * 1024.0);
        }

        public double ToGigaBytes()
        {
            return _bytes / (1024.0 * 1024.0 * 1024.0);
        }
    }
}
import unittest
from ansible.plugins.lookup.csvfile import CSVRecoder, CSVReader, LookupModule


class TestCSVRecoder(unittest.TestCase):
    def test_read(self):
        f = open('test.csv', 'w')
        f.write('a,b,c\n1,2,3\n')
        f.close()
        creader = CSVRecoder(open('test.csv', 'r'), 'utf-8')
        result = next(creader).decode('utf-8')
        self.assertEqual(result, b'a,b,c\n')
        f.close()

class TestCSVReader(unittest.TestCase):
    def test_read(self):
        f = open('test.csv', 'w')
        f.write('a,b,c\n1,2,3\n')
        f.close()
        creader = CSVReader(open('test.csv', 'r'), delimiter=',', encoding='utf-8')
        result = next(creader).decode()
        self.assertEqual(result, ['a', 'b', 'c'])
        f.close()

class TestLookupModule(unittest.TestCase):
    def test_read_csv(self):
        lookupfile = 'test.csv'
        key = 'a'
        delimiter = ','
        encoding = 'utf-8'
        dflt = None
        col = 1
        f = open(lookupfile, 'w')
        f.write('a,b,c\n1,2,3\n')
        f.close()
        result = LookupModule().read_csv(lookupfile, key, delimiter, encoding, dflt, col)
        self.assertEqual(result, 1)
        f.close()

if __name__ == '__main__':
    unittest.main()
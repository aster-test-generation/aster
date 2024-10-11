import unittest
from ansible.plugins.lookup.csvfile import CSVRecoder, CSVReader, LookupModule


class TestCSVRecoder(unittest.TestCase):
    def test_recoder(self):
        with open('test.csv', 'r') as f:
        recoder = CSVRecoder(f)
        self.assertEqual(next(recoder), b'a,b,c\n')
        f.close()

class TestCSVReader(unittest.TestCase):
    def test_reader(self):
        with open('test.csv', 'r') as f:
        reader = CSVReader(f)
        self.assertEqual(next(reader), ['a', 'b', 'c'])
        f.close()

class TestLookupModule(unittest.TestCase):
    def test_read_csv(self):
        lookup = LookupModule()
        result = lookup.read_csv(os.path.join(self.tmp, 'test.csv'), 'key1', ',', 'utf-8', 'default', 1)
        self.assertEqual(result, 'value1')

    def test_run(self):
        lookup = LookupModule()
        result = lookup.run(['key1'], file='test.csv', delimiter=',', encoding='utf-8', default='default', col=1)
        self.assertEqual(result, ['value1'])

if __name__ == '__main__':
    unittest.main()
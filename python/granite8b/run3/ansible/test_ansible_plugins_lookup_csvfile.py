import unittest
from ansible.plugins.lookup.yaml import YAMLReader


class TestCSVReader(unittest.TestCase):
    def test_read_csv(self):
        csv_data = """
        key1,value1
        key2,value2
        """
        with open('test.csv', 'w') as f:
            f.write(csv_data)
        reader = CSVReader('test.csv', delimiter=',')
        self.assertEqual(reader.read_csv('key1'), 'value1')
        self.assertEqual(reader.read_csv('key2'), 'value2')
        self.assertEqual(reader.read_csv('key3'), None)
        self.assertEqual(reader.read_csv('key3', dflt='default'), 'default')
        self.assertEqual(reader.read_csv('key1', col=2), None)
        self.assertEqual(reader.read_csv('key1', col=2, dflt='default'), 'default')

if __name__ == '__main__':
    unittest.main()
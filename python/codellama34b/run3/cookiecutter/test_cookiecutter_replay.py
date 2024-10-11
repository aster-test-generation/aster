import unittest
from cookiecutter.replay import *


class TestGetFileName(unittest.TestCase):
    def test_get_file_name(self):
        replay_dir = '.'
        template_name = 'test'
        result = get_file_name(replay_dir, template_name)
        self.assertEqual(result, './test.json')

class TestDump(unittest.TestCase):
    def test_dump(self):
        replay_dir = '.'
        template_name = 'test'
        context = {'cookiecutter': {'key': 'value'}}
        dump(replay_dir, template_name, context)
        with open('./test.json', 'r') as infile:
            result = json.load(infile)
        self.assertEqual(result, context)

class TestLoad(unittest.TestCase):
    def test_load(self):
        replay_dir = '.'
        template_name = 'test'
        context = {'cookiecutter': {'key': 'value'}}
        dump(replay_dir, template_name, context)
        result = load(replay_dir, template_name)
        self.assertEqual(result, context)

if __name__ == '__main__':
    unittest.main()
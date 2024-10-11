import unittest
from cookiecutter.replay import *


class TestGetFileName(unittest.TestCase):
    def test_get_file_name(self):
        replay_dir = 'test_dir'
        template_name = 'test_template'
        result = get_file_name(replay_dir, template_name)
        self.assertEqual(result, 'test_dir/test_template.json')

class TestDump(unittest.TestCase):
    def test_dump(self):
        replay_dir = 'test_dir'
        template_name = 'test_template'
        context = {'cookiecutter': {'test_key': 'test_value'}}
        dump(replay_dir, template_name, context)
        with open('test_dir/test_template.json', 'r') as infile:
            result = json.load(infile)
        self.assertEqual(result, context)

class TestLoad(unittest.TestCase):
    def test_load(self):
        replay_dir = 'test_dir'
        template_name = 'test_template'
        context = {'cookiecutter': {'test_key': 'test_value'}}
        dump(replay_dir, template_name, context)
        result = load(replay_dir, template_name)
        self.assertEqual(result, context)

if __name__ == '__main__':
    unittest.main()
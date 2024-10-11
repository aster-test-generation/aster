import unittest
from cookiecutter.replay import *


class TestGetFileName(unittest.TestCase):
    def test_get_file_name(self):
        replay_dir = "test_dir"
        template_name = "test_template"
        result = get_file_name(replay_dir, template_name)
        self.assertEqual(result, "test_dir/test_template.json")

class TestDump(unittest.TestCase):
    def test_dump(self):
        replay_dir = "test_dir"
        template_name = "test_template"
        context = {"cookiecutter": {"test_key": "test_value"}}
        dump(replay_dir, template_name, context)
        replay_file = get_file_name(replay_dir, template_name)
        with open(replay_file, 'r') as infile:
            context = json.load(infile)
        self.assertEqual(context, {"cookiecutter": {"test_key": "test_value"}})

class TestLoad(unittest.TestCase):
    def test_load(self):
        replay_dir = "test_dir"
        template_name = "test_template"
        context = {"cookiecutter": {"test_key": "test_value"}}
        dump(replay_dir, template_name, context)
        result = load(replay_dir, template_name)
        self.assertEqual(result, {"cookiecutter": {"test_key": "test_value"}})

if __name__ == '__main__':
    unittest.main()
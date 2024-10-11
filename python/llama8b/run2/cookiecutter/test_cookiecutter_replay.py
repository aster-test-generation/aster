import json
import os
import unittest
from cookiecutter.replay import get_file_name, dump, loa


class TestGetFileName(unittest.TestCase):
    def test_get_file_name(self):
        replay_dir = 'replay_dir'
        template_name = 'template_name'
        result = get_file_name(replay_dir, template_name)
        self.assertEqual(result, os.path.join(replay_dir, 'template_name.json'))

    def test_get_file_name_with_suffix(self):
        replay_dir = 'replay_dir'
        template_name = 'template_name.json'
        result = get_file_name(replay_dir, template_name)
        self.assertEqual(result, os.path.join(replay_dir, 'template_name.json'))

class TestDump(unittest.TestCase):
    def test_dump(self):
        replay_dir = 'replay_dir'
        template_name = 'template_name'
        context = {'cookiecutter': 'cookiecutter'}
        dump(replay_dir, template_name, context)
        self.assertTrue(os.path.exists(os.path.join(replay_dir, 'template_name.json')))

    def test_dump_non_string_template_name(self):
        replay_dir = 'replay_dir'
        template_name = 123
        with self.assertRaises(TypeError):
            dump(replay_dir, template_name, {})

    def test_dump_non_dict_context(self):
        replay_dir = 'replay_dir'
        template_name = 'template_name'
        context = 123
        with self.assertRaises(TypeError):
            dump(replay_dir, template_name, context)

    def test_dump_missing_cookiecutter_key(self):
        replay_dir = 'replay_dir'
        template_name = 'template_name'
        context = {'key': 'value'}
        with self.assertRaises(ValueError):
            dump(replay_dir, template_name, context)

class TestLoad(unittest.TestCase):
    def test_load(self):
        replay_dir = 'replay_dir'
        template_name = 'template_name'
        context = {'cookiecutter': 'cookiecutter'}
        with open(os.path.join(replay_dir, 'template_name.json'), 'w') as f:
            json.dump(context, f)
        result = load(replay_dir, template_name)
        self.assertEqual(result, context)

    def test_load_non_string_template_name(self):
        replay_dir = 'replay_dir'
        template_name = 123
        with self.assertRaises(TypeError):
            load(replay_dir, template_name)

    def test_load_missing_file(self):
        replay_dir = 'replay_dir'
        template_name = 'template_name'
        with self.assertRaises(FileNotFoundError):
            load(replay_dir, template_name)

if __name__ == '__main__':
    unittest.main()
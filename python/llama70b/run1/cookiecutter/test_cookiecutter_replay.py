import json
import os
import unittest
import cookiecutter.replay


class TestGetFileName(unittest.TestCase):
    def test_get_file_name(self):
        replay_dir = 'replay_dir'
        template_name = 'template_name'
        result = get_file_name(replay_dir, template_name)
        self.assertEqual(result, os.path.join(replay_dir, template_name + '.json'))

class TestDump(unittest.TestCase):
    def test_dump(self):
        replay_dir = 'replay_dir'
        template_name = 'template_name'
        context = {'cookiecutter': 'value'}
        dump(replay_dir, template_name, context)
        replay_file = get_file_name(replay_dir, template_name)
        with open(replay_file, 'r') as infile:
            loaded_context = json.load(infile)
        self.assertEqual(loaded_context, context)

    def test_dump_io_error(self):
        replay_dir = '/non/existent/path'
        template_name = 'template_name'
        context = {'cookiecutter': 'value'}
        with self.assertRaises(IOError):
            dump(replay_dir, template_name, context)

    def test_dump_type_error_template_name(self):
        replay_dir = 'replay_dir'
        template_name = 123
        context = {'cookiecutter': 'value'}
        with self.assertRaises(TypeError):
            dump(replay_dir, template_name, context)

    def test_dump_type_error_context(self):
        replay_dir = 'replay_dir'
        template_name = 'template_name'
        context = 'not a dict'
        with self.assertRaises(TypeError):
            dump(replay_dir, template_name, context)

    def test_dump_value_error_context(self):
        replay_dir = 'replay_dir'
        template_name = 'template_name'
        context = {}
        with self.assertRaises(ValueError):
            dump(replay_dir, template_name, context)

class TestLoad(unittest.TestCase):
    def test_load(self):
        replay_dir = 'replay_dir'
        template_name = 'template_name'
        context = {'cookiecutter': 'value'}
        dump(replay_dir, template_name, context)
        result = load(replay_dir, template_name)
        self.assertEqual(result, context)

    def test_load_type_error_template_name(self):
        replay_dir = 'replay_dir'
        template_name = 123
        with self.assertRaises(TypeError):
            load(replay_dir, template_name)

    def test_load_value_error_context(self):
        replay_dir = 'replay_dir'
        template_name = 'template_name'
        context = {}
        dump(replay_dir, template_name, context)
        with self.assertRaises(ValueError):
            load(replay_dir, template_name)

if __name__ == '__main__':
    unittest.main()
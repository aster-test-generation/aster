import os
import unittest
import cookiecutter.replay


class TestGetFileName(unittest.TestCase):
    def test_get_file_name(self):
        replay_dir = 'path/to/replay'
        template_name = 'template.json'
        result = get_file_name(replay_dir, template_name)
        self.assertEqual(result, os.path.join(replay_dir, template_name))

class TestDump(unittest.TestCase):
    def test_dump_success(self):
        replay_dir = 'path/to/replay'
        template_name = 'template.json'
        context = {'cookiecutter': {'key': 'value'}}
        dump(replay_dir, template_name, context)
        self.assertTrue(os.path.exists(os.path.join(replay_dir, template_name)))

    def test_dump_io_error(self):
        replay_dir = '/non/existent/path'
        template_name = 'template.json'
        context = {'cookiecutter': {'key': 'value'}}
        with self.assertRaises(IOError):
            dump(replay_dir, template_name, context)

    def test_dump_type_error_template_name(self):
        replay_dir = 'path/to/replay'
        template_name = 123
        context = {'cookiecutter': {'key': 'value'}}
        with self.assertRaises(TypeError):
            dump(replay_dir, template_name, context)

    def test_dump_type_error_context(self):
        replay_dir = 'path/to/replay'
        template_name = 'template.json'
        context = 'not a dict'
        with self.assertRaises(TypeError):
            dump(replay_dir, template_name, context)

    def test_dump_value_error_context(self):
        replay_dir = 'path/to/replay'
        template_name = 'template.json'
        context = {'not_cookiecutter': {'key': 'value'}}
        with self.assertRaises(ValueError):
            dump(replay_dir, template_name, context)

class TestLoad(unittest.TestCase):
    def test_load_success(self):
        replay_dir = 'path/to/replay'
        template_name = 'template.json'
        context = {'cookiecutter': {'key': 'value'}}
        dump(replay_dir, template_name, context)
        result = load(replay_dir, template_name)
        self.assertEqual(result, context)

    def test_load_type_error_template_name(self):
        replay_dir = 'path/to/replay'
        template_name = 123
        with self.assertRaises(TypeError):
            load(replay_dir, template_name)

    def test_load_value_error_context(self):
        replay_dir = 'path/to/replay'
        template_name = 'template.json'
        dump(replay_dir, template_name, {'not_cookiecutter': {'key': 'value'}})
        with self.assertRaises(ValueError):
            load(replay_dir, template_name)

if __name__ == '__main__':
    unittest.main()
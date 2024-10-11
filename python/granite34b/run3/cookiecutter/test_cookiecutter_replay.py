import unittest
from cookiecutter.replay import get_file_name, dump, load


class TestReplay(unittest.TestCase):
    def test_get_file_name(self):
        replay_dir = '/path/to/replay/dir'
        template_name = 'template_name.json'
        expected_file_name = '/path/to/replay/dir/template_name.json'
        file_name = get_file_name(replay_dir, template_name)
        self.assertEqual(file_name, expected_file_name)

    def test_dump(self):
        replay_dir = '/path/to/replay/dir'
        template_name = 'template_name.json'
        context = {'cookiecutter': {'key': 'value'}}
        dump(replay_dir, template_name, context)
        # Add assertions to check if the file was created and contains the correct context

    def test_load(self):
        replay_dir = '/path/to/replay/dir'
        template_name = 'template_name.json'
        context = {'cookiecutter': {'key': 'value'}}
        dump(replay_dir, template_name, context)
        loaded_context = load(replay_dir, template_name)
        self.assertEqual(loaded_context, context)

if __name__ == '__main__':
    unittest.main()
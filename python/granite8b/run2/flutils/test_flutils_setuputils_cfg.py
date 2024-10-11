import unittest
from flutils.setuputils.cfg import each_sub_command_config


class TestEachSubCommandConfig(unittest.TestCase):
    def test_each_sub_command_config(self):
        for config in each_sub_command_config():
            self.assertIsInstance(config.name, str)
            self.assertIsInstance(config.camel, str)
            self.assertIsInstance(config.description, str)
            self.assertIsInstance(config.commands, tuple)
            for command in config.commands:
                self.assertIsInstance(command, str)

if __name__ == '__main__':
    unittest.main()